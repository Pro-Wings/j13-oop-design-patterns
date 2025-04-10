🎯 Scenario
Suppose you have a FileDownloader service that allows users to download files from a remote server.

However:

Only premium users are allowed to download files.

You want to log download attempts.

You might also want to limit file size (say, < 100MB).

So, instead of giving the client direct access to the downloader, you place a proxy in between to enforce these rules.