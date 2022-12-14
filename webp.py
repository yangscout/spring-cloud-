import json
from flask import Flask, Response, request, make_response, jsonify

app = Flask(__name__)

@app.route("/health")
def health():
    result = {'status': 'UP'}
    return Response(json.dumps(result), mimetype='application/json')

@app.route("/getUser")
def getUser():
    result = {'username': 'python', 'password': 'python123'}
    printhello()
    return Response(json.dumps(result), mimetype='application/json')

@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found(py)'}), 404)

def printhello():
    print("hello world")

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=3000)
