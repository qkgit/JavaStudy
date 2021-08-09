package pers.qkgit.javaUtils.rule.rule.ruleAbstract;

import pers.qkgit.javaUtils.rule.model.RuleDto;

/**
 * @Author Qi
 * @data 2021/8/6 13:41
 * 抽象规则
 */
public interface BaseRule {

    boolean execute(RuleDto dto);
}
