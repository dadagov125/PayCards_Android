package cards.pay.paycardsrecognizer.sdk.utils;

import androidx.annotation.RestrictTo;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public class Constants {

    private Constants() { }

    public static final boolean DEBUG = true;

    public static final String ASSETS_DIR = "cardrecognizer";

    public static final String MODEL_DIR = "cardrecognizer/model";

    public static final int NEURO_DATA_VERSION = 9;

    public static final String PAYCARDS_URL = "https://pay.cards";
}
