param([Parameter(ValueFromRemainingArguments=$true)] $Args)

# Find npm; prefer the .cmd wrapper to avoid executing npm.ps1
$npmCmd = (Get-Command npm -ErrorAction SilentlyContinue).Source
if (-not $npmCmd) {
    Write-Error "npm not found. Ensure Node.js is installed and on PATH."
    exit 1
}
if ($npmCmd -match '\.ps1$') {
    $npmCmd = $npmCmd -replace '\.ps1$','.cmd'
}
if (-not (Test-Path $npmCmd)) {
    Write-Error "npm.cmd not found. Found: $npmCmd"
    exit 1
}

# Invoke npm.cmd with provided arguments
& $npmCmd @Args
