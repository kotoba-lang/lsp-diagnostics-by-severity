(ns kotoba.lsp.diagnostics-by-severity
  "diagnostics-by-severity -- addressed on its own.

  Split out of kotoba.lang.lsp on 2026-09-09 (ADR-2609091200). The unit
  here is the DEFINITION, and this repo's deps.edn names exactly the
  definitions it reaches -- nothing else.
"
  (:require [kotoba.lsp.severity-rank :refer [severity-rank]])
)

(defn diagnostics-by-severity
  "Sort diagnostics most-severe first."
  [diags]
  (sort-by #(get severity-rank (:severity %)) diags))
