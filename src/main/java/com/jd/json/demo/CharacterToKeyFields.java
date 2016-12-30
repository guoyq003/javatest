package com.jd.json.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by guoyq on 2016/12/30.
 */
public class CharacterToKeyFields {
    public static void main(String[] args) {
        String parse="{:pdNames \"马冉\", :pmName \"曲深\", :usedHours 101.0, " +
                ":projDeptCosts [{:deptName \"市场营销部\", :_id 20491, :budgetManErp " +
                "\"bjliuj\", :mark 0, :deptId \"00009736\", :projRate 1.0, :parentName " +
                "\"家电事业部\", :projId \"19b97f1cf24e4906835133b2ce04c067\", " +
                ":createTime #inst \"2016-12-01T09:52:25.000-00:00\", " +
                ":updateTime #inst \"2016-12-28T16:05:12.075-00:00\", " +
                ":projName \"大家电单品页垂直化项目\", :budgetManName \"刘俊\", " +
                ":fullName \"京东集团-京东商城-家电事业部-市场营销部\", " +
                ":proportion 1.0, :parentId \"00005013\"}], :planHours 0, " +
                ":planStartTime #inst \"2016-11-27T16:00:00.000-00:00\", " +
                ":projTypeName \"预研\", :projNumber \"201612X015X0\", " +
                ":pmErp \"qushen5\", :projectName \"大家电单品页垂直化项目\", " +
                ":businessDeptName \"市场营销部\", :priorityTypeName \"其它\", " +
                ":projDevDepts [{:_id 38144, :devDeptCode \"00016612\", " +
                ":mark 0, :adderIp \"bjxingyanxiang\", " +
                ":projId \"19b97f1cf24e4906835133b2ce04c067\", " +
                ":orgTierCode \"ROOT/00024935/00016610/00016612\", " +
                ":addTime #inst \"2016-12-01T09:52:25.000-00:00\", " +
                ":fullName \"研发部门-商城研发部-项目管理与性能测试部-网站及市场支持组\", " +
                ":adderErp \"qushen5\", :devDeptName \"网站及市场支持组\"}], " +
                ":businessManName \"刘俊\", " +
                ":developDepTierCodes \"ROOT/00024935/00016610/00016612\", " +
                ":createrTime #inst \"2016-12-01T09:52:25.000-00:00\", " +
                ":projName \"大家电单品页垂直化项目\", " +
                ":currentEndTime #inst \"2016-12-28T16:07:06.770-00:00\", " +
                ":planEndTime #inst \"2016-12-12T16:00:00.000-00:00\", " +
                ":developDepNames \"网站及市场支持组\", :percent 21, " +
                ":planPercent 44, :poNames \"\", " +
                ":des \"对家电前端页面样式做了重新的设计，使其更加适应家电较为特殊的业务需求，包括对于品牌LOGO和客服的强化，以及售后信息的图片化展示。\", " +
                ":developDepTierName \"研发部门-商城研发部-项目管理与性能测试部-网站及市场支持组\"}";

    }
}
