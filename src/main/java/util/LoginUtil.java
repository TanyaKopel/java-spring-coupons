package util;

import com.tanya.springcouponproject.SpringCouponProjectApplication;
import com.tanya.springcouponproject.dal.CompanyDAL;
import com.tanya.springcouponproject.dal.CustomerDAL;
import com.tanya.springcouponproject.enums.UserType;
import com.tanya.springcouponproject.services.AdminService;
import com.tanya.springcouponproject.services.CompanyService;
import com.tanya.springcouponproject.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class LoginUtil {

    public static UserService userService(String email, String password, UserType userType) {

        ApplicationContext ctx = SpringApplication.run(SpringCouponProjectApplication.class);
        CompanyDAL companyDAL = ctx.getBean(CompanyDAL.class);
        CustomerDAL customerDAL = ctx.getBean(CustomerDAL.class);

        switch (userType) {

            case Administrator:
                if (email.toString().equals("admin@admin.com") && password.toString().equals("Coding@2022")) {
                    UserService userService = ctx.getBean(AdminService.class);
                    return userService;
                }
                break;

            case Company:
                if (companyDAL.isCompanyExists(email, password)) {
                    UserService userService = ctx.getBean(CompanyService.class);
                    return userService;
                }
                break;

            case Customer:
                if (customerDAL.isCustomerExists(email, password)) {
                    UserService userService = ctx.getBean(CompanyService.class);
                    return userService;
                }
                break;

            default:
                System.out.println("Invalid Credentials");
        }
        return null;
    }
}