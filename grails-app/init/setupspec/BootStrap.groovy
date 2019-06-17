package setupspec

class BootStrap {

    static long initTime

    def init = { servletContext ->
        initTime = System.currentTimeMillis()
    }
    def destroy = {
    }
}
