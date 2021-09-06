package pers.qkgit.javaUtils.rule.rule;

import pers.qkgit.javaUtils.rule.constant.RuleConstant;
import pers.qkgit.javaUtils.rule.model.RuleDto;
import pers.qkgit.javaUtils.rule.rule.ruleAbstract.AbstractRule;

/**
 * @Author Qi
 * @data 2021/8/6 16:40
 */
public class AgeRule extends AbstractRule {
    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AgeRule.execute 调用");
        if (dto.getAge() >= RuleConstant.MATCH_AGE_ADULT){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AgeRule{}";
    }
}
