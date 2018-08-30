package shirodemo.utils;

import org.springframework.stereotype.Repository;

@Repository
public class EncoderUtil  {



    public String encode(CharSequence charSequence) {
        return (String) charSequence;
    }

    public boolean matches(CharSequence charSequence, String s) {
        return false;
    }
}
