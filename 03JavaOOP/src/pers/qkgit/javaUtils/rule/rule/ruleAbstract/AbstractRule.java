package pers.qkgit.javaUtils.rule.rule.ruleAbstract;

import pers.qkgit.javaUtils.rule.model.RuleDto;

/**
 * @Author Qi
 * @data 2021/8/6 13:48
 *  规则_模板
 */
public abstract class AbstractRule implements BaseRule {

    /**
     *  改造业务数据
     * @param dto  业务数据
     * @param <T>
     * @return
     */
    protected <T> T convert(RuleDto dto){
        System.out.println("AbstractRule.convert");
        return (T) dto;
    }

    /**
     *  执行规则
     * @param t
     * @param <T>
     * @return
     */
    protected <T> boolean executeRule(T t){
        System.out.println("AbstractRule.executeRule  调用");
        return true;
    }

    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AbstractRule.execute  调用");
        return executeRule(convert(dto));
    }
}
