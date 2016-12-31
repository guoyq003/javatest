package com.jd.regex.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by guoyq on 2016/12/30.
 */
public class CharacterToKeyFields {
    public Map getBaseInfoMap(String baseinfoStr){
        String baseInfoArryStr[]={"projNumber","projName","priorityTypeName","des","businessManName","businessDeptName",
                "roiTypeNames","roiTargets","projTypeName","developDepTierName","developDepNames",
                "developDepTierCodes","pmErp","pmName","pmoErp","pmoName","poNames","pdNames"};
        String baseInfoArrydate[]={"createrTime","startTime","endTime","planStartTime","planEndTime"};
        String baseInfoArryInt[]={"planHours","usedHours","planPercent","percent"};
        Map baseInfoMap =new LinkedHashMap();
        for (int i=0;i<baseInfoArryStr.length;i++){
            Pattern p= Pattern.compile(":"+baseInfoArryStr[i]+" \"(.*?)\"");
            Matcher m=p.matcher(baseinfoStr);
            while(m.find()){
                baseInfoMap.put(baseInfoArryStr[i],m.group(1));
            }
        }
        for (int i=0;i<baseInfoArrydate.length;i++){
            Pattern p= Pattern.compile(":"+baseInfoArrydate[i]+" #inst \"(.*?)\"");
            Matcher m=p.matcher(baseinfoStr);
            while(m.find()){
                baseInfoMap.put(baseInfoArrydate[i],m.group(1));
            }
        }
        for (int i=0;i<baseInfoArryInt.length;i++){
            Pattern pint = Pattern.compile(":"+baseInfoArryInt[i]+" (.*?),");
            Matcher mint=pint.matcher(baseinfoStr);
            while(mint.find()){
                baseInfoMap.put(baseInfoArryInt[i],mint.group(1));
            }
        }
        return baseInfoMap;
    }
    public Map getProjDeptCostsMap(String projDeptCostsStr){
        String projDeptCostsArryStr[]={"deptId","detpName","parentId","parentName","tierId",
                "fullName","budgetManErp","budgetManName"};
        String projDeptCostsArryDouble[]={"projRate"};
        Map projDeptCostsMap =new LinkedHashMap();
        for (int i=0;i<projDeptCostsArryStr.length;i++){
            Pattern p= Pattern.compile(":"+projDeptCostsArryStr[i]+" \"(.*?)\"");
            Matcher m=p.matcher(projDeptCostsStr);
            while(m.find()){
                projDeptCostsMap.put(projDeptCostsArryStr[i],m.group(1));
            }
        }
        for (int i=0;i<projDeptCostsArryDouble.length;i++){
            Pattern p= Pattern.compile(":"+projDeptCostsArryDouble[i]+" (.*?),");
            Matcher m=p.matcher(projDeptCostsStr);
            while(m.find()){
                projDeptCostsMap.put(projDeptCostsArryDouble[i],m.group(1));
            }
        }
        return projDeptCostsMap;
    }
}
