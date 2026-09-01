(ns logseq.db.frontend.property-build-test
  (:require [cljs.test :refer [deftest is]]
            [logseq.db.frontend.property.build :as property-build]))

(deftest property-value-block-references-its-property
  (is (= [{:db/ident :user.property/related}]
         (:block/refs
          (property-build/build-property-value-block
           {:db/id 1}
           {:db/ident :user.property/related}
           "[[page]]")))))
