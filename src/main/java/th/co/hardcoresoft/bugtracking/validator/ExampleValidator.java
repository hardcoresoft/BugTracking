package th.co.hardcoresoft.bugtracking.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("exampleValidator") 
public class ExampleValidator implements Validator
{

    @Override
    public boolean supports(Class<?> clazz)
    {
//        return Movie.class.isAssignableFrom(clazz);
        return false;
    }

    @Override
    public void validate(Object model, Errors errors)
    {
//        Movie movie = (Movie) model;
//        
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "movieCode","required.field");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "movieNameTh","required.field");
        
    }

}
