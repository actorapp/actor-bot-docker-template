# Docker-ready bot template

This is template to write and run your own bot in docker container.

## Create bot on server

Create bot token via `actor-cli` (with/or without admin privileges):

```
actor-cli create-bot --username bot_username --name BotName --admin
```

## Bot Installation

To start bot via docker, execute:

```
docker run -e BOT_USERNAME=<username of bot> -e BOT_TOKEN=<token of bot created via cli> -e BOT_ENDPOINT=wss://api.actor.im actor/echo-bot
```

| Argument        | Required           | Description  |
| ----------- |:-------------:| :-----|
| BOT_USERNAME      | yes | Bot's username |
| BOT_TOKEN      | yes      | Bot's Token |
| BOT_ENDPOINT | no      | Server API endpoint. If no set will connect to main actor cloud. |

## Licesnse

MIT
