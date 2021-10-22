package HomeWork8;

public final class AppGlobalState {

    private static AppGlobalState INSDTANCE;
    private static final String API_KEY = "bxcly4A1pgT8Wg2Tca7MAc0lU1kAFQrj";
    private String selectedCity = null;

    private AppGlobalState(){
    }
    public static AppGlobalState getInstance(){
        if (INSDTANCE == null){
            INSDTANCE = new AppGlobalState();
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
