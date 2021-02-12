package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService

class MainViewModel : ViewModel() {
    var countries: MutableLiveData<ArrayList<Country>> = MutableLiveData<ArrayList<Country>>();
    var countryService: CountryService = CountryService();

    /***
     * On init, load the countries and their codes into the program
     */
    init {
        fetchCountries();
    }

    /***
     * Loads the countries and their codes
     */
    fun fetchCountries() {
        countries = countryService.fetchCountries();
    }
}
