def call() {
    for(i in 1..1000) {
        def jsonSchemaValidator = new org.mozilla.fxtest.JsonSchemaValidator()
        jsonSchemaValidator.validate("", "")
    }
}
