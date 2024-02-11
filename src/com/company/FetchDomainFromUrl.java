package com.company;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.*;

public class FetchDomainFromUrl {

    private static Map<String,Set<String>> createmapforUrl(Set<String> urls){
        if(urls!=null) {
            Map<String, Set<String>> map = new HashMap<>();
            for (String url : urls) {
                String domain = fetchDomainfromurl(url);
                if (map.containsKey(domain)) {
                    map.get(domain).add(url);
                } else {
                    Set<String> set = new HashSet<>();
                    set.add(url);
                    map.put(domain, set);
                }
            }
            return map;
        }
        else{
            return new HashMap<>();
        }
    }

    private static String fetchDomainfromurl(String url)  {
        if(url!=null) {
            try {
                URI uri = new URI(url);
                String domain = uri.getHost();
                if (domain != null && domain.contains("www")) {
                    domain = domain.substring(4);
                }
                return domain;
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return null;
        }
        else{
            return null;
        }
    }
    public static void main(String[] args) {
        Set<String> urls =new HashSet<>();
        urls.add("https://www.google.com/abcd");
        urls.add("https://www.google.com/deghi");
        urls.add("https://www.facebook.com/abcd");
        urls.add("https://www.facebook.com/aisoeudf");
        urls.add("https://www.yahoo.com/abcd");

//        Map<String,Set<String>> mapUrl =createmapforUrl(urls);
//        System.out.println(mapUrl);




    }
}
