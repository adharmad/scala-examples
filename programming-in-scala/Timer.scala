object Timer {
    def oncePerSecond(callback: () => unit) {
        while (true) {
            callback(); Thread sleep 1000;
        }
    }

    def timeFlies() {
        println("time files like an arrow...");
    }

    def main(args: Array[String]) {
        oncePerSecond(timeFlies);
    }
}
