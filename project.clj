(defproject com.edbond/postal "1.13"
  :repositories {"java.net" "http://download.java.net/maven/2"}
  :dependencies [[commons-codec "1.9"]
                 [javax.mail/mail "1.4.7"
                  :exclusions [javax.activation/activation]]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}})
