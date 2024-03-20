void call() {
    sh '''
        echo "----- Creating plan to validate -----"
        terraform plan -no-color -out=tfplan -input=false
        terraform show -no-color -json tfplan > tfplan.json
    '''
}


// void call() {
//      echo "----- Creating plan to validate -----"
//     sh 'terraform plan -no-color -out=tfplan -input=false'
//     sh  'terraform show -no-color -json tfplan > tfplan.json'
// }
