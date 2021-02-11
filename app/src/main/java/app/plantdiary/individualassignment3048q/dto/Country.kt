package app.plantdiary.individualassignment3048q.dto

class Country (var code: String, var name: String, var countryId: Int = 0){

    override fun toString() : String {
        return "$name $code";
    }
}