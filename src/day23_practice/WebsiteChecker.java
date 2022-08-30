package day23_practice;

public class WebsiteChecker {
    /*Website checker

	Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain

Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu */
    public static void main(String[] args) {

        int countEdu = 0;
        int countCom = 0;
        int countOrg = 0;
        int countOther = 0;



        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};


        for (int i = 0; i < websites.length; i++) {
            if(websites[i].contains(".com")){
                countCom++;
            } else if (websites[i].contains(".edu")){
                countEdu++;
            } else if ((websites[i].contains(".org"))){
                countOrg++;
            } else {
                countOther++;
            }
        }

        System.out.println(countCom + " websites with domain .com found");
        System.out.println(countEdu + " websites with domain .edu found");
        System.out.println(countOrg + " websites with domain .org found");
        System.out.println(countOther + " websites with other domains found");



    }
}
