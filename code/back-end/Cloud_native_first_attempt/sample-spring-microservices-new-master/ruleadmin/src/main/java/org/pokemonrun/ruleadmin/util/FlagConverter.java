package org.pokemonrun.ruleadmin.util;

import org.pokemonrun.ruleadmin.entity.Flag;
import org.pokemonrun.ruleadmin.info.FlagInfo;

public class FlagConverter {
    public static FlagInfo toInfo(Flag flag){
        String lng = String.valueOf(flag.getLongitude());
        String lat = String.valueOf(flag.getLatitude());
        FlagInfo info = new FlagInfo(lng, lat);
        return info;
    }
    public static Flag toEntity(FlagInfo info){
        double lng = Double.parseDouble(info.getLng());
        double lat = Double.parseDouble(info.getLat());
        Flag flag = new Flag();
        flag.setLongitude(lng);
        flag.setLatitude(lat);
        return flag;
    }
}
