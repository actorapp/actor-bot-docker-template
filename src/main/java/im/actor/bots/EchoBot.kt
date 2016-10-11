package im.actor.bots

import im.actor.bots.framework.MagicForkScope
import im.actor.bots.framework.stateful.*

class EchoBot(scope: MagicForkScope) : MagicStatefulBot(scope) {

    override fun configure() {
        enablePersistent = false

        if (scope.peer.isGroup) {
            return
        }

        oneShot("default") {
            if (isText) {
                if (scope.sender != null) {
                    sendText(text)
                }
            }
        }
    }

}
