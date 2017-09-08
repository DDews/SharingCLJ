(defproject sharing "0.1.0-SNAPSHOT"
  :description "Displays a collection of strings in a random order."
  :url "http://github.com/DDews/SharingCLJ/releases"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sharing.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
