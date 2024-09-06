This project is based off this tutorial by Dan Vega: https://www.youtube.com/watch?v=ZoPVGrB8iHU&list=PLZV0a2jwt22uoDm3LNDFvN6i2cAVU_HTH&index=6&pp=iAQB

However it is upgraded to use the current spring ai version 1.0.0-M2

Make sure you:

1. Upload a pdf to src/main//resources/docs and reference it correctly in ReferenceDocsLoader.java -> pdfResource
2. Set up you openai api key as an environment variable
3. You have docker and docker compose installed
4. You are using GraalVM and not GraalCE as your java installation if you're going to do a native compilation ( you can use sdkman to make it easier ).
