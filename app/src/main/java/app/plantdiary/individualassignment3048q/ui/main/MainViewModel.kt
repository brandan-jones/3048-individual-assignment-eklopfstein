package app.plantdiary.individualassignment3048q.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment3048q.dto.Country
import app.plantdiary.individualassignment3048q.service.CountryService

class MainViewModel : ViewModel() {
    lateinit var countries: MutableLiveData<ArrayList<Country>>;
    var countryService: CountryService = CountryService();

    // TODO: Implement the ViewModel
    fun fetchCountries() {
        countries = countryService.fetchCountries();
    }
}
