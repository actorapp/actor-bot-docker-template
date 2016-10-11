FROM actor/base-java:latest
MAINTAINER Actor LLC <speed@actor.im>

# RUN apk --update add bash openssl
ADD build/docker/bin/* /opt/actor-bots/bin/
ADD build/docker/lib/* /opt/actor-bots/lib/

CMD ["/opt/actor-bots/bin/actor-bots"]
