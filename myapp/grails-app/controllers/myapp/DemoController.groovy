package myapp


class DemoController{

    def index() {
        sendMail(to:"Binay",from: "Raj")
        render "Mail sent."
    }
}
