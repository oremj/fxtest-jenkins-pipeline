def call() {
    def jsonSchemaValidator = new org.mozilla.fxtest.JsonSchemaValidator()
    jsonSchemaValidator.validate("", "")
}
