
import org.junit.Test;
import pers.qkgit.javaUtils.rule.model.RuleDto;
import pers.qkgit.javaUtils.rule.rule.AddressRule;
import pers.qkgit.javaUtils.rule.rule.AgeRule;
import pers.qkgit.javaUtils.rule.rule.NationalityRule;
import pers.qkgit.javaUtils.rule.service.RuleService;

import java.util.Arrays;

/**
 * @Author Qi
 * @data 2021/8/6 14:17
 */
public class RuleServiceTest {


    @Test
    public void test(){
        // 规则执行器
        // 优点：比较简单，每个规则可以独立，将规则，数据，执行器拆分出来，调用方比较规整
        // 缺点：数据依赖公共传输对象 dto

        //1. 定义规则 init rule
        AddressRule addressRule = new AddressRule();
        NationalityRule nationalityRule = new NationalityRule();
        AgeRule ageRule = new AgeRule();

        //2. 构造需要的数据 create dto
        RuleDto dto = new RuleDto();
        dto.setAddress("北京");
        dto.setAge(16);
        RuleDto dto1 = new RuleDto();
        dto1.setAddress("北京1");
        dto1.setAge(99);

        //3. 通过以链式调用构建和执行 rule execute
        //   and 与 or 是 and关系
        //   即：nationalityRule && addressRule && ( ageRule || addressRule )
        boolean ruleResult = RuleService
                .create()
                .and(Arrays.asList(nationalityRule,addressRule))
                .or(Arrays.asList(ageRule,addressRule))
                .execute(dto);

        System.out.println("执行结果: " + ruleResult);

        boolean b = RuleService
                .create()
                .and(Arrays.asList(addressRule))
                .or(Arrays.asList(addressRule))
                .execute(dto1);
        System.out.println(b);
    }
}
