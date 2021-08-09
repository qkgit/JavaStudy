package pers.qkgit.javaUtils.rule.rule;

import pers.qkgit.javaUtils.rule.constant.RuleConstant;
import pers.qkgit.javaUtils.rule.model.NationalityRuleDto;
import pers.qkgit.javaUtils.rule.model.RuleDto;
import pers.qkgit.javaUtils.rule.rule.ruleAbstract.AbstractRule;

/**
 * @Author Qi
 * @data 2021/8/6 15:07
 */
public class NationalityRule extends AbstractRule {

    @Override
    protected <T> T convert(RuleDto dto) {
        System.out.println("NationalityRule.convert  调用");
        NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
        if (dto.getAddress().startsWith(RuleConstant.MATCH_ADDRESS_START)) {
            nationalityRuleDto.setNationality(RuleConstant.MATCH_NATIONALITY_START);
        }
        return (T) nationalityRuleDto;
    }


    @Override
    protected <T> boolean executeRule(T t) {
        System.out.println("NationalityRule.executeRule  调用");
        NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
        if (nationalityRuleDto.getNationality().startsWith(RuleConstant.MATCH_NATIONALITY_START)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "NationalityRule{}";
    }
}
