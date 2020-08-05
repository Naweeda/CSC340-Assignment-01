package project1;

import javax.xml.crypto.Data;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.ArrayList;

public enum DataDesign {

    Arrow("Arrow", "[noun] : ", "Here is one arrow: <IMG> -=>> </IMG>"),
    AdjDistinct1("Distinct", "[adjective] : ", "Familiar. Worked in Java."),
    AdjDistinct2("Distinct", "[adjective] : ", "Unique. No duplicates. Clearly different or of a different kind."),
    AdvDistinct1("Distinct", "[adverb] : ", "Uniquely. Written \"distinctly\"."),
    NounDist1("Distinct", "[noun] : ", "A keyword in this assignment."),
    NounDist2("Distinct", "[noun] : ", "A keyword in this assignment."),
    NounDist3("Distinct", "[noun] : ", "A keyword   in this assignment."),
    NounDist4("Distinct", "[noun] : ", "An advanced search option."),
    NounDist5("Distinct", "[noun] : ", "Distinct is a parameter in this assignment."),
    AdjPlaceholder1("Placeholder", "[adjective] : ","To be updated..."),
    AdjPlaceholder2("Placeholder", "[adjective] : ","To be updated..."),
    AdvPlaceholder1("Placeholder", "[adverb] : ",  "To be updated..."),
    ConPlaceholder1("Placeholder", "[conjunction] : ", "To be updated..."),
    InterPlaceholder1("Placeholder", "[interjection] : ", "To be updated..."),
    NounPlaceholder1("Placeholder", "[noun] : ", "To be updated..."),
    NounPlaceholder2("Placeholder", "[noun] : ", "To be updated..."),
    NounPlaceholder3("Placeholder", "[noun] : ", "To be updated..."),
    PrePlacholder1("Placeholder", "[preposition] : ", "To be updated..."),
    ProPlacehoder1("Placeholder", "[pronoun] : ", "To be updated..."),
    VerbPlacholder1("Placeholder", "[verb] : ", "To be updated..."),
    CSC340Adj1("CSC340", "[adjective] : ", "= C++ version of CSC210 + CSC220 + more."),
    CSC340Noun1("CSC340", "[noun] : ", "A CS upper division course."),
    CSC340Noun2("CSC340", "[noun] : ",  "Many hours outside of class."),
    CSC340Noun3("CSC340", "[noun] : ", "Programming Methodology."),
    CSC340Verb1("CSC220", "[verb] : ",  "To create data structures."),
    NounBook1("Book", "[noun] : ", "A set of pages."),
    NounBook2("Book", "[noun] : ", "A written work published in printed or electronic form."),
    VerbBook1("Book", "[verb] : ", "To arrange for someone to have a seat on a plane."),
    VerbBook2("Book", "[verb] : ", "To arrange something on a particular date."),
    AdvDef("Adverb", "[noun] : ", "Adverb is a word that adds more information about place, time, manner, cause or degree to a verb, an adjective, a phrase or another adverb."),
    AdjDef("Adjective", "[noun] : ", "Adjective is a word that describes a person or thing, for example big, red and clever in a big house, red wine and a clever idea."),
    IntDef("Interjection", "[noun] : ", "Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),
    NounDef("Noun", "[noun] : ", "Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris city) or a thing, a quality or an activity (such as plant, sorrow or tennis.");


    private String Description;
    private String DesType;
    private String Meaning;

    private DataDesign(String Description, String DesType, String Meaning) {
        this.Description = Description;
        this.DesType = DesType;
        this.Meaning = Meaning;
    }

    public String getDescription()
    {
        return Description;
    }
    public String getDesType()
    {
        return DesType;
    }
    public String getMeaning()
    {
        return Meaning;
    }
    public void setDescription(String Description)
    {
        this.Description = Description;
    }
    public void setDesType()
    {
        this.DesType = DesType;
    }
    public void setMeaning()
    {
        this.Meaning = Meaning;
    }

    public String toString(){
        return Description + ", " + DesType + ", " + Meaning;
    }

    public static HashMap<DataDesign,String> getMap1(){
        HashMap<DataDesign,String> map1 = new HashMap<DataDesign,String>();
        {
            for (DataDesign dt : DataDesign.values()) {
                map1.put(dt, dt.getDescription());
            }
        }

        return map1;
    }

    public static HashMap<DataDesign,String> getMap3(){
        HashMap<DataDesign,String> map3 = new HashMap<DataDesign,String>();
        // HashMap<String, ArrayList<Dataofdictionary>> mymap = new HashMap<String, ArrayList<Dataofdictionary>>();
        {
            for (DataDesign dt : DataDesign.values()) {
                map3.put(dt,dt.getMeaning());
            }
        }
        return map3;
    }


    public static HashMap<DataDesign,String> getMap2(){
        HashMap<DataDesign,String> map2 = new HashMap<DataDesign,String>();
        {
            for (DataDesign dt : DataDesign.values()) {

                map2.put(dt, dt.getDesType());
            }
        }
        return map2;
    }
}
