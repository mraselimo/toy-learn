#!/bin/bash

filename=$1

RES=$(java org.antlr.v4.gui.TestRig sletoy prog "$filename" 2>&1)

echo "$RES" | grep "line" >&2

exit $((1-$?))
