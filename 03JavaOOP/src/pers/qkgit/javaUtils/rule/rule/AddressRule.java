package pers.qkgit.javaUtils.rule.rule;

import pers.qkgit.javaUtils.rule.constant.RuleConstant;
import pers.qkgit.javaUtils.rule.model.RuleDto;
import pers.qkgit.javaUtils.rule.rule.ruleAbstract.AbstractRule;

/**
 * @Author Qi
 * @data 2021/8/6 13:56
 */
public class AddressRule extends AbstractRule {

    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AddressRule.execute 调用");
        if (dto.getAddress().startsWith(RuleConstant.MATCH_ADDRESS_START)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AddressRule{}";
    }
}
