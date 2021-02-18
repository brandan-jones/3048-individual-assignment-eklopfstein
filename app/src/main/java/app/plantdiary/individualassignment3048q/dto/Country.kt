package app.plantdiary.individualassignment3048q.dto

data class Country(private var Code: String, private var Name: String) {

    // variable names in unit tests are lowercase but in the json file they are uppercase
    // to address this problem I made the class variable uppercase and added getters and setter
    // that are lowercase

    var code: String
        get() {
            return Code;
        }
        set(code: String) {
            Code = code;
        }
    var name: String
        get() {
            return Name;
        }
        set(name: String) {
            Name = name;
        }

    /***
     * Prints the country names ad as the name then the code
     */
    override fun toString(): String {
        return "$Name $Code";
    }
}