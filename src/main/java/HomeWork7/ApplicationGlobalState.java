package HomeWork7;

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSDTANCE;
    private static final String API_KEY = "bxcly4A1pgT8Wg2Tca7MAc0lU1kAFQrj";
    private String selectedCity = null;

    private ApplicationGlobalState(){
    }
    public static ApplicationGlobalState getInstance(){
        if (INSDTANCE == null){
            INSDTANCE = new ApplicationGlobalState();
        }
        return INSDTANCE;
    }
    public String getSelectedCity(){
        return selectedCity;
    }
    public String getApiKey(){
        return this.API_KEY;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
}
