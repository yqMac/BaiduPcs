package com.rookie.test;

import com.rookie.baidupcs.auth.BaiduPcsAuthCheck;
import retrofit.RestAdapter;

/**
 * Created by rookie on 2017/5/30.
 */
public class BaiduPcsTest {


    public static void main(String[] args) throws Exception {
        String apiKey = "HlVP0DFDKH6GX8h7ur2QNX8X";
        String scrKey = "F1kPkicSKvB9TVnuoSae5k6hWdZ85jK0";
        //AccessToken accessToken = new AccessToken()
        BaiduPcsAuthCheck baiduPcsAuthCheck = new BaiduPcsAuthCheck(apiKey, scrKey, RestAdapter.LogLevel.FULL);
        //baiduPcsAuthCheck.refreshToken()

    }
    public  static  void  t1() {


        String url = "http://openapi.baidu.com/oauth/2.0/authorize";

    }
}
