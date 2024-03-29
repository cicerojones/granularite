(defproject granularite "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 ;; [org.clojure/clojure "1.10.3"]
                 [org.clojure/clojure "1.11.1"]
                 [nrepl "0.9.0"]
                 [overtone "0.10.6"]]
  :main ^:skip-aot granularite.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :repl {:plugins [[cider/cider-nrepl "0.28.4"]
                    [mx.cider/enrich-classpath "1.9.0"]]}
  )
