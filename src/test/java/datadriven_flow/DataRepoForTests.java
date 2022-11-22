package datadriven_flow;

import org.testng.annotations.DataProvider;

public class DataRepoForTests {

    @DataProvider(name = "dataProviderForDeleteCalls")
    public Object[] dataProviderForDelete() {

        return new Object[]{
                1, 2, 3, 4, 5

        };
    }

    @DataProvider(name = "dataProviderForPostcallsfromDataRepo")
    public Object[][] dataProviderForPostcallsfromDataRepo() {

        return new Object[][]{
                {"Ram123", "General Manager"},
                {"Shyam123", "CEO"},
                {"Lakshman123", "Leader"},
                {"Ram234", "General Manager"},
                {"Shyam234", "CEO"},
                {"Lakshman234", "Leader"},
                {"Ram345", "General Manager"},
                {"Shyam345", "CEO"},
                {"Lakshman345", "Leader"}
        };

    }
}