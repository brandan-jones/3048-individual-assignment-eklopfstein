package app.plantdiary.individualassignment3048q.dto

data class Country(private var Code: String, private var Name: String) {

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

    override fun toString(): String {
        return "$Name $Code";
    }
}