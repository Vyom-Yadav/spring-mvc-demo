package com.luv2code.springdemo.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code
    public String[] value() default {"LUV"};

    // define default error message
    public String message() default "must start with LUV";

    // define default groups
    public Class<?>[] groups() default {};

    // define default payloads
    public Class<? extends Payload>[] payload() default {};

    /*
    The topic of custom annotations is an advanced topic. As a result, the advanced coding can be complex and confusing.

An annotation type is defined using the @interface keyword. All attributes of an annotation type are declared in a method-like manner.

So in our example, we are defining a custom "CourseCode" annotation.  We use this annotation as @CourseCode.

This annotation has four attributes: value, message, groups and payload. The attributes are like parameters. You can use them to customize an annotation.

@CourseCode(value="...", message="...", groups="...", payload="...")

Let's look at the first entry you posted.

public Class<?>[] groups() default {};

As I mentioned above, when creating an annotation, the attributes for the attribute are declared in a method like fashion.
As a result, the attribute named: "groups", is listed as "groups()". Note the use of the parens ... in a method like fashion.
However, this is not a method ... but in fact an attribute for the annotation.

This annotation will contain an array of Class objects. The <?> specifies generics, means we can provide any type at runtime.
The attribute can also have a default value. In this case, the default value is an empty array, denoted by {}.

That covers the "groups" attribute.

The "payload" attribute is defined in a similar pattern.

Now, here's more information that is specific to the Bean Validation API.
The specification of the Bean Validation API demands, that any constraint annotation defines

    an attribute "message" that returns the default key for creating error messages in case the constraint is violated

    an attribute "groups" that allows the specification of validation groups, to which this constraint belongs. This must default to an empty array.

These are known as Constraint definition properties. You can read more about these properties in the Bean Validation specification.
http://beanvalidation.org/1.1/spec/#constraintsdefinitionimplementation-constraintdefinition-properties

---

I understand this an advanced concept. It takes some time to become familiar with it. Let me know if you need anything else.

---

Additional References



Creating Custom Annotations: https://docs.oracle.com/javase/tutorial/java/annotations/declaring.html

Bean Validation Specification: http://beanvalidation.org/1.1/spec/


     */


}
