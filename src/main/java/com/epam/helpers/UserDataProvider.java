package com.epam.helpers;

import com.epam.config.PropertiesReader;

public final class UserDataProvider {

    private static final PropertiesReader PROPERTIES_READER = PropertiesReader
            .getInstance("user_data.properties");

    private UserDataProvider() {
    }
    public static String getUserEmail() {
        return PROPERTIES_READER.getProperty("superAdminEmail");
    }

    public static String getUserPassword() {
        return PROPERTIES_READER.getProperty("superAdminPassword");
    }

    public static String getAdminEmail() {
        return PROPERTIES_READER.getProperty("adminEmail");
    }

    public static String getAdminPassword() {
        return PROPERTIES_READER.getProperty("adminPassword");
    }

    public static String getMentorEmail() {return PROPERTIES_READER.getProperty("mentorPassword");
    }

    public static String getMentorPassword() {return PROPERTIES_READER.getProperty("mentorEmail");
    }

    public static String getSignupStudentName(){return PROPERTIES_READER.getProperty("studentname");}

    public static String getSignupStudentSurName(){return PROPERTIES_READER.getProperty("studentSurname");}

    public static String getSignupStudentEmail(){return PROPERTIES_READER.getProperty("studentEmail");}
    public static String getSignupStudentPassword(){return PROPERTIES_READER.getProperty("studentPassword");}
}