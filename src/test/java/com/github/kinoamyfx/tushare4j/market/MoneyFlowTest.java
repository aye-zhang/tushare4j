package com.github.kinoamyfx.tushare4j.market;

import com.github.kinoamyfx.tushare4j.CodeUtils;
import org.junit.Test;

public class MoneyFlowTest {

    String content = "<tbody><tr>\n" +
            "<td>ts_code</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>TS代码</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>trade_date</td>\n" +
            "<td>str</td>\n" +
            "<td>Y</td>\n" +
            "<td>交易日期</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_sm_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>小单买入量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_sm_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>小单买入金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_sm_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>小单卖出量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_sm_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>小单卖出金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_md_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>中单买入量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_md_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>中单买入金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_md_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>中单卖出量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_md_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>中单卖出金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_lg_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>大单买入量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_lg_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>大单买入金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_lg_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>大单卖出量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_lg_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>大单卖出金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_elg_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>特大单买入量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>buy_elg_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>特大单买入金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_elg_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>特大单卖出量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>sell_elg_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>特大单卖出金额（万元）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_mf_vol</td>\n" +
            "<td>int</td>\n" +
            "<td>Y</td>\n" +
            "<td>净流入量（手）</td>\n" +
            "</tr>\n" +
            "<tr>\n" +
            "<td>net_mf_amount</td>\n" +
            "<td>float</td>\n" +
            "<td>Y</td>\n" +
            "<td>净流入额（万元）</td>\n" +
            "</tr>\n" +
            "</tbody>";

    public void codeg() {
        CodeUtils.codeg4(content);
    }
}