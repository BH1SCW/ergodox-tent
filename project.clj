(defproject ergodox-tent "0.1.0-SNAPSHOT"
  :description "A tent for the Ergodox"
  :url "https://github.com/adereth/ergodox-tent"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"], [scad-clj "0.5.3"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
