package com.jd.json.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by guoyq on 2016/12/30.
 */
public class CharacterToKeyFields {
    public static void main(String[] args) {
        String
                parse = "[{CSTM_NO:\"11118\",CSTM_NAME:\"广东XX电力有限公司\",FIX_GNL:\"111810158\",FIX_ACC:\"D201306070003\",OP_FLAG:\"正常\",BUSS_KIND_NAME:\"三个月定期存款\",BAL:\"25,178,750.00\",AVAL_BAL:\"25,178,750.00\",OP_DATE:\"2013-06-07\",DUE_DATE:\"2013-12-07\",ROWNUM_:1,idx:0},{CSTM_NO:\"11118\",CSTM_NAME:\"广东XX电力有限公司\",FIX_GNL:\"111810158\",FIX_ACC:\"D201306070002\",OP_FLAG:\"正常\",BUSS_KIND_NAME:\"三个月定期存款\",BAL:\"25,178,750.00\",AVAL_BAL:\"25,178,750.00\",OP_DATE:\"2013-06-07\",DUE_DATE:\"2013-12-07\",ROWNUM_:3,idx:2},{CSTM_NO:\"11118\",CSTM_NAME:\"广东XX电力有限公司\",FIX_GNL:\"111810158\",FIX_ACC:\"D201306070005\",OP_FLAG:\"正常\",BUSS_KIND_NAME:\"三个月定期存款\",BAL:\"25,178,750.00\",AVAL_BAL:\"25,178,750.00\",OP_DATE:\"2013-06-07\",DUE_DATE:\"2013-12-07\",ROWNUM_:4,idx:3}]";


        String regex = "FIX_ACC:(.*?),OP_FLAG";//别忘了使用非贪婪模式！


        Matcher matcher = Pattern.compile(regex).matcher(parse);


        while (matcher.find())


        {


            String ret = matcher.group(1);


            System.out.println(ret);
        }
    }
}
