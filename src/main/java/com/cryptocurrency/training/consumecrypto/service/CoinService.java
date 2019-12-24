package com.cryptocurrency.training.consumecrypto.service;

import com.cryptocurrency.training.consumecrypto.model.Coin;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class CoinService {

    public void callCoinsThirdParty(RestTemplate restTemplate){

        /*getForObject: RestTemplate is for parsing and marshaling*/
        Coin[] coin = restTemplate.getForObject("https://api.coinmarketcap.com/v1/ticker/",Coin[].class);
        Object[] filteredCoins = Arrays.stream(coin).filter(x->x.getName().equalsIgnoreCase("eos")).toArray();
        for(int i = 0; i<filteredCoins.length;i++){
            Coin x = (Coin)filteredCoins[i];
            System.out.println(x.toString());
        }
    }
}
