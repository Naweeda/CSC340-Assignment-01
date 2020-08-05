package project1;

import java.util.HashMap;



public class JavaDictionary {

    private String Description;
    private String DesType;
    private String Meaning;

    public JavaDictionary(String Description, String DesType,String Meaning) {
        this.Description=Description;
        this.DesType=DesType;
        this.Meaning=Meaning;

    }



    public String getDescription()
    {
        return this.Description;
    }
    public String getDesType()
    {
        return this.DesType;
    }
    public String getMeaning()
    {
        return this.Meaning;
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

    @Override
    public int hashCode() {
        return this.Description.hashCode()+this.DesType.hashCode()+this.Meaning.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof JavaDictionary) {
            JavaDictionary jad=(JavaDictionary)obj;
            return (jad.getDescription().equals(this.Description)&&(jad.getDesType().equals(this.DesType)&&(jad.getDesType().equals(this.getMeaning()))));
        }
        else {
            return false;
        }
    }

}
