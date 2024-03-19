void call() {
    currentBuild.description = "$BUILD_NUMBER - $GIT_COMMIT_SHORT"
    echo "$BUILD_NUMBER - $GIT_COMMIT_SHORT"
}
