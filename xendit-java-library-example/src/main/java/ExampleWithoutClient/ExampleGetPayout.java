package ExampleWithoutClient;

import com.xendit.exception.XenditException;
import com.xendit.Xendit;
import com.xendit.model.payout.Payout;

public class ExampleGetPayout {
    public static void main(String[] args) {
        //access key with Option
        Xendit.Opt.setApiKey("xnd_development_...");

        //access static variable (same as old code )
        //Xendit.apiKey = "xnd_development_...";

        try {
            Payout payout = Payout.getPayout("7ecf7953-01e8-41db-a6fe-471b1c65df5b");
            System.out.println(payout);
        } catch (XenditException e) {
            e.printStackTrace();
        }
    }
}
