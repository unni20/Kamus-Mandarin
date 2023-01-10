import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String PREFERENCE_FILE_KEY = "myAppPreference";
    private static final String KAMUS_MANDARIN_BASE_URL = "https://restapi.mdp.ac.id/kamusmandarin";
    private static final String KAMUS_MANDARIN_APIKEY = "dirumahaja";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(KAMUS_MANDARIN_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
