package im.actor.bots

import im.actor.bots.framework.farm

fun main(args: Array<String>) {

    val bot_endpoint = System.getenv("BOT_ENDPOINT")
    val bot_username = System.getenv("BOT_USERNAME")
    val bot_token = System.getenv("BOT_TOKEN")
    val bot_trace = System.getenv("BOT_TRACE")

    if (bot_username == null) {
        throw RuntimeException("Please, set BOT_USERNAME environment variable")
    }
    if (bot_token == null) {
        throw RuntimeException("Please, set BOT_TOKEN environment variable")
    }

    farm("NewFarm") {
        if (bot_endpoint != null) {
            endpoint = bot_endpoint
        }
        bot(EchoBot::class) {
            name = bot_username
            token = bot_token
            traceHook = bot_trace
        }
    }
}
