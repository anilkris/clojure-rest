(defproject clojure-rest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.1"]
                 [ring/ring-json "0.4.0"]
                 [c3p0/c3p0 "0.9.1.2"]
                 [org.clojure/java.jdbc "0.7.7"]
                 [com.h2database/h2 "1.4.197"]
                 [cheshire "5.8.0"]
                 [ring/ring-mock "0.3.2"]
                 ]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler clojure-rest.core/app}
  :main ^:skip-aot clojure-rest.core
  :target-path "target/%s"
  :profiles {
             :uberjar {:aot :all}
             
             })
